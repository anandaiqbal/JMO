package id.indocyber.jmo.activity.program

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.indocyber.jmo.databinding.ProgramFragmentItemBinding
import id.indocyber.jmo.entity.Program

class ProgramAdapter : RecyclerView.Adapter<ProgramViewHolder>() {
    val data = ArrayList<Program>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProgramViewHolder {
        return ProgramViewHolder(
            ProgramFragmentItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ProgramViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

}

class ProgramViewHolder(val binding: ProgramFragmentItemBinding) :
    RecyclerView.ViewHolder(binding.root) {


    fun bind(program: Program) {
        binding.program.text = program.programName
        binding.description.text = program.description
    }
}

